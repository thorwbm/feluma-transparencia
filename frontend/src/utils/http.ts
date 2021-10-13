import axios from 'axios'


const http = axios.create({
    baseURL: 'https://transparencia-pos-graducao.herokuapp.com'
})

export default http

