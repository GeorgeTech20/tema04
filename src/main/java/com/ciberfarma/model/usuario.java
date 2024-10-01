package com.ciberfarma.model;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class usuario {
    private String nombres;
    private String apellido;
    private String usuario;
    private String contraseña;
    private LocalDateTime fechaNacimiento;
}
