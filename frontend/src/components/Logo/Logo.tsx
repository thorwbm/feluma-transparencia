import { Link } from 'react-router-dom';
import logo from './logo-pos-bco.svg'

const Logo = () => {
  return (
    <div>
      <Link to="/">
        <img src={logo} alt="Faculdade de Ciências Médicas" width="190" />
      </Link>
    </div>

  )
}

export default Logo;