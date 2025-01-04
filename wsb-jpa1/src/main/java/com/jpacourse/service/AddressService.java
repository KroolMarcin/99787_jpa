package com.jpacourse.service;

import com.jpacourse.dto.AddressTO;
import java.util.List;

public interface AddressService {
    List<AddressTO> getAddressesByCity(String city);
    AddressTO findById(Long id);
}
