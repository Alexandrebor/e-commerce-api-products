package br.senac.devweb.api.product.produto;

import br.senac.devweb.api.product.categoria.Categoria;
import com.querydsl.core.types.Predicate;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Long>,
        QuerydslPredicateExecutor<Produto> {

    List<Produto> findAll(Predicate filter);
}
