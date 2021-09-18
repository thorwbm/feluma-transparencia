import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3">ola mundoooooooo </h1>
                <div className="text-center">
                    <Link className="btn btn-primary btn-lg bg-primary" to="/resultado">Pesquisar</Link>
                </div>
            </div>
            <Footer />
        </>

    );
}

export default Home;