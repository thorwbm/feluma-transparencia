export type RegistroDiploma = {
    id: number;
    aluno: string;
    curso: string;
    livro: string;
    pagina: string;
    entidadeExpedidora: string;
    
}

export type Registro = {
    id: number;
    aluno: string;
    curso: string;
    livro: string;
    pagina: string;
    dataIngresso?: string;
    dataConclusao?: string;
    datacExpedicao?: string;
    dataRegistro?: string;
    entidadeExpedidora: string;
    entidadeRegistradora?: string;    
}