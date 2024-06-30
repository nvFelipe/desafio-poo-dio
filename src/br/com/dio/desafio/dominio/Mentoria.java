package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "br.com.dio.desafio.dominio.Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


    public void setData(LocalDate data) {
        this.data = data;
    }



    public LocalDate getData() {
        return data;
    }
}
