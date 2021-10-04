
import {   RegistroPesquisa } from "types/registro";
import http from "utils/http";

export const getCertificadoPorAluno = (pesquisa: String) =>
    http
        .get<RegistroPesquisa>("http://localhost:8080/registros/pesquisa?pesquisa=" + pesquisa)
        .then(res => res.data);
