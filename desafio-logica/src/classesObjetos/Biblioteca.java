package classesObjetos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> livros;

    public Biblioteca(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public Livro buscarPorId(int id){
        for (Livro l : livros){
            if (l.getId() == id){
                return l;
            }
        }
        return null;
    }

}
