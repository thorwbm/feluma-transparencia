import CertificadoCard from 'components/CertificadoCard'
import Footer from 'components/Footer'
import NavBar from 'components/NavBar'
import { useState } from 'react'
import { getCertificadoPorAluno } from 'services/Resultados.service'
import { RegistroDiploma } from 'types/registro'
import Pesquisar from 'components/Pesquisar'
import Swal from 'sweetalert2'

const Resultado = () => {
  let contador = 0

  const carregarRegistros = (reg: RegistroDiploma[]) => {
    let qtd_registro = reg.map((item) => item).length

    if (qtd_registro === 0) {
      Swal.fire(
        'Não foi encontrado nenhum registro para sua pesquisa. Refaça sua perquisa e verifique o que foi digitado!!!'
      )
    }
  }

  const [registros, setRegistros] = useState<RegistroDiploma[]>([])

  const pesquisar = async (value: string) => {
    try {
      const { content } = await getCertificadoPorAluno(value).then()
      setRegistros(content)
      carregarRegistros(registros)
    } catch (error) {
      console.log((error as Error).message)
      if ((error as Error).message === 'Network Error') {
        Swal.fire(
          'aqui deu errado, não foi possivel conectar o bando de dados!!!'
        )
      } else {
        Swal.fire(
          'Entrar em contato com o administrador do sistema, não foi possivel identificar o erro!!! - ' +
            (error as Error).message
        )
      }
    }
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
