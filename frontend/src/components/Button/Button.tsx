import { Link } from "react-router-dom";

const Button = (props: {className?: string, route: string, value: string}) => {
    
    return (
        <div>
            <Link to={props.route} className={props.className}>{props.value}</Link>

        </div>
    )
}

export default Button;