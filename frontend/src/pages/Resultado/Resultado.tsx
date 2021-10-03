import Button from "components/Button";
import CertificadoCard from "components/CertificadoCard";
import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { useEffect, useState } from "react";
import { getCertificadoPorAluno } from "services/Resultados.service";
import { RegistroDiploma } from "types/registro";

const Resultado = () => {

    const [registros, setRegistros] = useState<RegistroDiploma[]>([]);
    
    useEffect (() => {
        async function fetchData(){
            const listaRegistro = await getCertificadoPorAluno("ADRIANE FALCONI BORJA PINTO");
            setRegistros(listaRegistro);
        }
        fetchData()
    },[])
   

    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary text-center">Resultado</h1>
                {registros.map( item => (
                        <CertificadoCard background = {(item.id % 2) === 0 ? "bg-cinza" : ""}
                                        aluno={item.aluno} curso= {item.curso} 
                                        entidadeExpedidora = {item.entidadeExpedidora}
                                        livro={item.livro} pagina={item.pagina} id={item.id}/>
                ))}
                <div className="text-center">
                    <Button route="/home" value="Nova Pesquisa" className="btn bg-primary px-4 my-3"/>
                </div>

            </div>
            <Footer />
        </>

    );
}

export default Resultado;

