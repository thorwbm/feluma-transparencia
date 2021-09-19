import Button from "components/Button";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Login = () => {
    return (
        <>
            <NavBar />
            <div className="container text-center col-sm-4">                
                <h1 className="text-primary py-3">ola mundoooooooo </h1>
                <form>
                    <div className="form-group mt-3">
                        <label>Email</label>
                        <input type="email" className="form-control" placeholder="Ex.: feluma@gmail.com" />
 
                    </div>
                    <div className="form-group mt-3">
                        <label >Senha</label>
                        <input type="password" className="form-control" placeholder="informe sua senha" />
                    </div>
                    <Button route="/home" value="Logar" className="btn bg-primary btn-lg mt-5" />
                </form>
            </div>
            <Footer />
        </>


    )
}

export default Login;