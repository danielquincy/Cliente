package com.cliente.modelo.repo.crud;

import com.cliente.modelo.entities.Daniel;
import com.cliente.modelo.repo.dao.DanielDao;
import org.springframework.data.repository.CrudRepository;

public interface DanielCrud extends CrudRepository<Daniel, Integer>, DanielDao {
}
