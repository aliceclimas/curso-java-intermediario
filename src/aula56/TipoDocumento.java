package aula56;

public enum TipoDocumento {

	CPF {
		@Override
		public String geraNumeroTeste() {
			return GerarCpfCnpj.cpf();
		}
	}, CNPJ {
		@Override
		public String geraNumeroTeste() {
			return GerarCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraNumeroTeste();
}
