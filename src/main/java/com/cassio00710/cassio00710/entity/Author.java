package com.cassio00710.cassio00710.entity;

import io.micrometer.core.lang.Nullable;

import javax.annotation.sql.DataSourceDefinition;





public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;


   @Column(Nullable = false, unique = true)
   private String name;

   @Column(nullable = false)
    private Integer age;


}
