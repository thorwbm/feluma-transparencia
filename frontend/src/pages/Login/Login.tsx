import Button from "components/Button";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Login = () => {
    return (
        <>
            <NavBar />
            <div className="container text-center">
                <h1 className="text-primary py-3">Login </h1>
               <Button route= "/home" value="LOGAR" className="btn bg-primary text-color-with" />
            </div>
            <Footer />
        </>
    )
}

export default Login;