import CertificadoCard from 'components/CertificadoCard'
import Footer from 'components/Footer'
import NavBar from 'components/NavBar'
import { useState } from 'react'
import { getCertificadoPorAluno } from 'services/Resultados.service'
import { RegistroDiploma } from 'types/registro'
import Pesquisar from 'components/Pesquisar'

const Resultado = () => {
  let contador = 1

  const [registros, setRegistros] = useState<RegistroDiploma[]>([])

  const pesquisar = async (value: string) => {
    const { content } = await getCertificadoPorAluno(value)
    setRegistros(content)
  }

  return (
    <>
      <NavBar />
      <div className="container">
        <Pesquisar onSubmit={pesquisar} />

        {registros.map((item) => (
          <CertificadoCard
            background={contador++ % 2 === 0 ? 'bg-cinza' : ''}
            aluno={item.aluno}
            curso={item.curso}
            entidadeExpedidora={item.entidadeExpedidora}
            livro={item.livro}
            pagina={item.pagina}
            id={item.id}
          />
        ))}

        {/* <div className="text-center">
          <Button
            route="/home"
            value="Nova Pesquisa"
            className="btn bg-primary px-4 my-3"
          />
        </div> */}
      </div>
      <Footer />
    </>
  )
}

export default Resultado
