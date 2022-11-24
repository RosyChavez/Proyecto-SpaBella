package com.crud.spabella.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="servicios")
public class Servicios {
    @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   @Column (unique=true,nullable = false)
   private Long idServicio;

   @Column (length = 25)
   private String nombre;

}
