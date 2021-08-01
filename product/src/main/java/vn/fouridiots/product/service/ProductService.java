package vn.fouridiots.product.service;

import vn.fouridiots.product.model.Product;

import java.util.List;
import java.util.Optional;

/**
 * @author DUY
 */
public interface ProductService {

    /**
     * Tìm kiếm sản phẩm bằng category, power, luminous flux
     * @param category tên category
     * @param power giá trị power
     * @param luminousFlux giá trị luminous flux
     */
    List<Product> findProductBy(Optional<String> category, Optional<Short> power, Optional<Short> luminousFlux);
}
