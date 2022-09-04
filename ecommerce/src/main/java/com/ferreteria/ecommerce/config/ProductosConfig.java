package com.ferreteria.ecommerce.config;

import com.ferreteria.ecommerce.model.Categoria;
import com.ferreteria.ecommerce.model.Producto;
import com.ferreteria.ecommerce.repository.CategoriaRepository;
import com.ferreteria.ecommerce.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductosConfig {
    @Bean
    CommandLineRunner comandLineRunner(ProductoRepository productoRepository, CategoriaRepository categoriaRepository){
        return args -> {
            Categoria categoria=new Categoria(
                    1L,
                    "Contrucción",
                    "Reparaciones",
                    "https://.."
                    );
            Producto martillo = new Producto(
                    3L,
                    categoria,
                    10500.0,
                    "Martillo",
                    1.2,
                    "Automatico...",
                    "https://sp.depositphotos.com/stock-photos/martillo.html",
                    "https://sp.depositphotos.com/stock-photos/martillo.html",
                    "ABC123",
                    15
            );
            Producto motosierra = new Producto(
                    4L,
                    categoria,
                    230100.0,
                    "Motosierra",
                    20.1,
                    "Cortar...",
                    "husqvarna.com/co/motosierras/288xp-r/",
                    "husqvarna.com/co/motosierras/288xp-r/",
                    "ABC235",
                    6
            );
            //categoriaRepository.save(categoria);
            //productoRepository.saveAll(
            //        List.of(martillo,motosierra)
            //);
        };
    }
}
