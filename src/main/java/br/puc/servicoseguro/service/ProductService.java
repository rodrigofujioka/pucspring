package br.puc.servicoseguro.service;

import br.puc.servicoseguro.repository.ProductRepository;
import br.puc.servicoseguro.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService
        implements CrudInterface<Product> {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> findAll() {

        return productRepository.findAll();
    }

    @Override
    public Optional<Product> save(Product entity) {

        return Optional.of(productRepository.save(entity));
    }

    @Override
    public Optional<Product> findById(long id) {

        return productRepository.findById(id);

    }

    @Override
    public void delete(Product entity) {
        productRepository.delete(entity);
    }

    @Override
    public void deleteById(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public long count() {
        return productRepository.count();
    }



}