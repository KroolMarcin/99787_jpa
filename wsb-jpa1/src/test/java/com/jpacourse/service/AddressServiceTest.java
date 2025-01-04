package com.jpacourse.service;

import com.jpacourse.dto.AddressTO;
import com.jpacourse.persistence.dao.AddressDao;
import com.jpacourse.persistence.entity.AddressEntity;
import com.jpacourse.service.impl.AddressServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class AddressServiceTest {

    @Mock
    private AddressDao addressDao;

    @InjectMocks
    private AddressServiceImpl addressService;

    public AddressServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAddressesByCity() {
        // given
        String city = "MockCity";
        List<AddressEntity> mockEntities = new ArrayList<>();
        AddressEntity entity = new AddressEntity();
        entity.setCity(city);
        entity.setPostalCode("12345");
        mockEntities.add(entity);

        when(addressDao.findAddressesByCity(city)).thenReturn(mockEntities);

        // when
        List<AddressTO> result = addressService.getAddressesByCity(city);

        // then
        assertThat(result).isNotEmpty();
        assertThat(result.get(0).getCity()).isEqualTo(city);
        verify(addressDao, times(1)).findAddressesByCity(city);
    }
}
