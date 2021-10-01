import CertificadoCard from "components/CertificadoCard";
import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { RegistroDiploma } from "types/reegisto";

const Resultado = () => {

    let registros: RegistroDiploma[]
   
    registros = [{id:1,aluno:"wemerson", curso:"teste curso", livro:"teste livro", pagina:"teste pagina",entidadeExpedidora:"expedidora"} ,
                 {id:2,aluno:"wemerson", curso:" curso", livro:" livro", pagina:" pagina",entidadeExpedidora:"expedidora"} ];
     
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary text-center">Resultado</h1>
                {registros.map( item => (
             <CertificadoCard background = {(item.id % 2) == 0 ? "bg-cinza" : ""}
                   aluno={item.aluno} curso= {item.curso} entidadeExpedidora = {item.entidadeExpedidora}
                   livro={item.livro} pagina={item.pagina} id={item.id}/>
         ))}
            </div>
            <Footer />
        </>

    );
}

export default Resultado;

