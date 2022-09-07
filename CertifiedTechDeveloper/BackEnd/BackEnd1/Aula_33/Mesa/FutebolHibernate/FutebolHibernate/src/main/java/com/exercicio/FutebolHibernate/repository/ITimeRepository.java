package com.exercicio.FutebolHibernate.repository;

import com.exercicio.FutebolHibernate.entity.TimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITimeRepository extends JpaRepository<TimeEntity, Long> {
}
