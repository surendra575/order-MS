package com.surendra.order.service;

import com.surendra.order.entity.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

/*This class is to generate the orderID */

@Service
public class SequenceGenerator {
    @Autowired
    private MongoOperations mongoOperations;

    public int generateNxtOrder(){
        Sequence counter = mongoOperations.findAndModify(
                query(where("_id").is("sequence")),//from the 'sequence' document
                new Update().inc("sequence", 1), // get the sequence and updated by 1
                options().returnNew(true).upsert(true), //if there is no 'sequence' document (Initially it wont available) it will create
                Sequence.class);//entity class
        return counter.getSequence();
    }

}
