
import React from "react";
 
declare interface CertificadoCardProps {
    id: number;
    aluno: string;
    curso: string;
    livro: string;
    pagina: string;
    entidadeExpedidora: string;
    background?:string;
}

const CertificadoCard : React.FC<CertificadoCardProps> = (props) => {
    return (<div className="card mt-3">
                <div className="card-body card-left">
                    <h5 className="card-title text-center">{props.curso}</h5>
                    <label>Aluno: </label> <br/>
                    <label>{props.aluno} </label><br/>
                    <label>Entidade Expedidora: </label><br/>
                    <label>A{props.entidadeExpedidora} </label><br/>
                    <label>Livro: </label><br/>
                    <label>A{props.livro} </label><br/>
                    <label>Pagina: </label><br/>
                    <label>A{props.pagina} </label><br/>
                    <p className="card-text">estes dados sao ficticios</p>
                    
                </div>
            </div>
            )
}

 export default CertificadoCard;