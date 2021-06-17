package br.com.erudio;

public class Greeting {

	private final long id;
	private final String content;
	
// - - - - - CONSTRUTOR - - - - - //
	
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
// - - - - - GETTERS (só os getters, pq é final e nao pode ser mudado)- - - - - //
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
	
}
