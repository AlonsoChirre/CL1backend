package pe.edu.cibertec.autobackendb.dto;

public record AutoResponse(
        String Codigo,
        String Mensaje,
        String AutoMarca,
        String AutoModelo,
        String AutoNroAsientos,
        String AutoPrecio,
        String AutoColor ) {}
