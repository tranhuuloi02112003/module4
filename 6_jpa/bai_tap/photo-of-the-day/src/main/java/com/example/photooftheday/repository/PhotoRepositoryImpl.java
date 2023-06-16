//package com.example.photooftheday.repository;
//
//import com.example.photooftheday.entity.Photo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//import java.util.List;
//@Repository
//@Transactional
//public class PhotoRepositoryImpl implements IPhotoRepository{
//    @PersistenceContext
//    private  EntityManager entityManager;
//    @Override
//    public void create(Photo photo) {
//        photo.setDate();
//        photo.setLikes(0);
//        entityManager.persist(photo);
//    }
//
//    @Override
//    public List<Photo> showAll() {
//        return entityManager.createQuery("select p from Photo p").getResultList();
//    }
//
//    @Override
//    public void addLike(Photo photo) {
//        photo.setLikes(photo.getLikes()+1);
//        entityManager.merge(photo);
//    }
//
//    @Override
//    public Photo findById(int id) {
//        return entityManager.find(Photo.class,id);
//    }
//
//    @Override
//    public List<Photo> findAllToday(String date) {
//        return entityManager.createQuery("select p from Photo p where p.date=?1").setParameter(1,date).getResultList();
//    }
//}
