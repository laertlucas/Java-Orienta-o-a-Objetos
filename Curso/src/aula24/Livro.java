package aula24;

public class Livro {
	
	private String nomeLivro;//Nuno Cobra - A semente da vitória
	private String autor;
	private String editora;//Senac São Paulo; 104ª edição (20 janeiro 2017)
	private String idioma;//Português
	private int paginas;//224 páginas
	private String idadeLeitura;//Bebê e acima
	private double dimensoes;//23 x 15.6 x 1.6 cm
	private int rankingMaisVendidos;//Nº 1,284 em Livros
	
	
	public String getNomeLivro() {
		return this.nomeLivro;
	}
	
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getEditora() {
		return this.editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getIdioma() {
		return this.idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public int getPaginas() {
		return this.paginas;
	}
	
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public String getIdadeLeitura() {
		return this.idadeLeitura;
	}
	
	public void setIdadeLeitura(String idadeLeitura) {
		this.idadeLeitura = idadeLeitura;
	}
	
	public double getDimensoes() {
		return this.dimensoes;
	}
	
	public void setDimensoes(double dimensoes) {
		this.dimensoes = dimensoes;
	}
	
	public int getRankingMaisVendidos() {
		return this.rankingMaisVendidos;
	}
	
	public void setRankingMaisVendidos(int rankingMaisVendidos) {
		this.rankingMaisVendidos = rankingMaisVendidos;
	}
	
	
}
