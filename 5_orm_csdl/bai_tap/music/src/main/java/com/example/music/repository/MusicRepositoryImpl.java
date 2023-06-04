package com.example.music.repository;

import com.example.music.entity.Music;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MusicRepositoryImpl implements IMusicRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Music> findList() {
        return entityManager.createQuery("select m from Music  m").getResultList();
    }

    @Override
    public void create(Music music) {
        entityManager.persist(music);
    }

    @Override
    public void update(Music music) {
        entityManager.merge(music);
    }

    @Override
    public void delete(int id ) {
        entityManager.remove(findById(id));
    }

    @Override
    public Music findById(int id) {
        return entityManager.find(Music.class,id);
    }
}
