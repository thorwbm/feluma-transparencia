import { FormEvent, useState } from 'react'

interface Iprops {
  onSubmit: (value: string) => void
}

const Pesquisar = ({ onSubmit }: Iprops) => {
  const [imputValue, setImputValue] = useState('')

  const handleSubmit = (e: FormEvent) => {
    e.preventDefault()
    console.log('teste teste teste')
    onSubmit(imputValue)
  }

  return (
    <>
      <form onSubmit={handleSubmit}>
        <button type="submit" className="btn bg-primary">
          Pesquisar
        </button>
        <input type="search" onChange={(e) => setImputValue(e.target.value)} />
      </form>
    </>
  )
}

export default Pesquisar
