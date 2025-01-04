package com.jpacourse.persistence.dao;

import com.jpacourse.persistence.entity.AddressEntity;
import java.util.List;

public interface AddressDao extends Dao<AddressEntity, Long> {
    List<AddressEntity> findAddressesByCity(String city);
}
