
import React from "react";
import "../CertificadoCard/CertificadoCard.css";
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
                    <h3 className="card-title text-center titulo-card">{props.curso}</h3>

                    <div className="label-card"><label>Aluno: </label> </div>
                    <div className="label-text mb-2"><label >{props.aluno} </label></div>

                    <div className="label-card"><label>Entidade Expedidora: </label></div>
                    <div className="label-text mb-2"><label >{props.entidadeExpedidora} </label></div>

                    <div className="label-card"><label>Livro: </label></div>
                    <div className="label-text mb-2"><label >{props.livro} </label></div>
                    
                    <div className="label-card"><label>Pagina: </label></div>
                    <div className="label-text mb-2"><label >{props.pagina} </label></div>
                

                    <p className="text-center label-card">estes dados sao ficticios</p>                    
                </div>
            </div>
            )
}

 export default CertificadoCard;