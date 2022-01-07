package collections.comparators;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import collections.model.Livro;

public class ComparatorPaginasLivro implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
    
}
