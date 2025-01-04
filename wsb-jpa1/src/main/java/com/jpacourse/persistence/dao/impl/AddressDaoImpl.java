package com.jpacourse.persistence.dao.impl;

import com.jpacourse.persistence.dao.AddressDao;
import com.jpacourse.persistence.entity.AddressEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class AddressDaoImpl extends AbstractDao<AddressEntity, Long> implements AddressDao {

    @Override
    public List<AddressEntity> findAddressesByCity(String city) {
        TypedQuery<AddressEntity> query = entityManager.createQuery(
            "SELECT a FROM AddressEntity a WHERE a.city = :city", AddressEntity.class);
        query.setParameter("city", city);
        return query.getResultList();
    }
}
