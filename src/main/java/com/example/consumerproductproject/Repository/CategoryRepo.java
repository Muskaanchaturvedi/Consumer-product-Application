package com.example.consumerproductproject.Repository;

import com.example.consumerproductproject.Model.Category;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends MongoRepository<Category, ObjectId> {

    @Query("{id: \"?0\"}")
    List<Category> findByID(ObjectId id);
    @Query("{name: \"?0\"}")
    List<Category> findByName(String name);

    @Query("{description: \"?0\"}")
    List<Category> findByDesc(String description);
}

