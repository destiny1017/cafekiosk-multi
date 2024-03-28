package cafekiosk.core.repository;

import cafekiosk.core.domain.product.ProductSellingStatus;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductJpaRepository productJpaRepository;

    @Override
    public Product save(Product product) {
        return productJpaRepository.save(product);
    }

    @Override
    public List<Product> findAllBySellingStatusIn(List<ProductSellingStatus> sellingStatuses) {
        return productJpaRepository.findAllBySellingStatusIn(sellingStatuses);
    }

    @Override
    public List<Product> findAllByProductNumberIn(List<String> productNumbers) {
        return productJpaRepository.findAllByProductNumberIn(productNumbers);
    }

    @Override
    public String findLatestProductNumber() {
        return productJpaRepository.findLatestProductNumber();
    }
}
