package cafekiosk.core.repository;

import cafekiosk.core.domain.product.ProductSellingStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {
    Product save(Product product);

    List<Product> findAllBySellingStatusIn(List<ProductSellingStatus> sellingStatuses);

    List<Product> findAllByProductNumberIn(List<String> productNumbers);

    String findLatestProductNumber();
}
