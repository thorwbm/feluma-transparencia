
import {  RegistroDiploma } from "types/registro";
import http from "utils/http";

export const getCertificadoPorAluno = (pesquisa: String) =>
    http
        .get<RegistroDiploma[]>('http://localhost:8080/registros')
        .then(res => res.data);
