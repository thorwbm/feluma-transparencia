import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Resultado = () => {
    return (
        <>
            <NavBar />
            <div className="container text-center">
                <h1 className="text-primary py-3">Resultado</h1>
                <div className="card">
                    <div className="card-body">
                        <h5 className="card-title">Card title</h5>
                        <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <Link to="/" className="btn btn-primary">Go somewhere</Link>
                    </div>
                 </div>
            </div>
            <Footer />
        </>

    );
}

export default Resultado;