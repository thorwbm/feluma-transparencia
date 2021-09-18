
import Home from 'pages/Home'
import Resultado from 'pages/Resultado';
import { BrowserRouter, Route, Switch } from 'react-router-dom'

const Routes =() => {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home />
                </Route>
                <Route path="/resultado" >
                    <Resultado />
                </Route>
            </Switch>
        </BrowserRouter >
    )
}

export default Routes;