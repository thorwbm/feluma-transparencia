import { FormEvent, useState } from 'react'

interface Iprops {
  onSubmit: (value: string) => void
}

const Pesquisar = ({ onSubmit }: Iprops) => {
  const [imputValue, setImputValue] = useState('')

  const handleSubmit = (e: FormEvent) => {
    e.preventDefault()
    console.log(imputValue)
    onSubmit(imputValue)
  }

  return (
    <>
      <div className="container">
        <form onSubmit={handleSubmit} className="navbar-form navbar-left">
          <div className="d-flex flex-row">
            <div>
              <button type="submit" className="btn bg-primary">
                Pesquisar
              </button>
            </div>
            <div className="col-sm">
              <input
                type="text"
                className="form-control"
                placeholder="Nome completo / CPF / RNE"
                onChange={(e) => setImputValue(e.target.value)}
              />
            </div>
          </div>
        </form>
      </div>
    </>
  )
}

export default Pesquisar
