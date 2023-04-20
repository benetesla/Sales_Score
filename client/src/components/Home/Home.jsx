/* eslint-disable jsx-a11y/anchor-is-valid */
import React from 'react'
import './Home.scss'
import Footer from '../Footer/Footer'
const Home = () => {
    return (
        <>
            <nav className="navbar navbar-expand-lg navbar-dark">
                <div className="container-fluid">
                    <a className="navbar-brand" href="#">
                        <i className="fas fa-shopping-cart"></i>
                        <span>Sale Store</span>
                    </a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarNavDarkDropdown">
                        <ul className="navbar-nav">
                            <li className="nav-item dropdown">
                                <a className="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    Gerenciamento de clientes
                                </a>
                                <ul className="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
                                    <li><a className="dropdown-item" href="#">Lista de clientes</a></li>
                                    <li><a className="dropdown-item" href="#">Novo cliente</a></li>
                                    <li><a className="dropdown-item" href="#">Atualizar cliente</a></li>
                                    <li><a className="dropdown-item" href="#">Deletar cliente</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

            <section className="home">
                <div className="container">
                    <div className="row">
                        <div className="col-12">
                            <h1 className="home__title">Bem vindo ao Sale Store</h1>
                            <p className="home__description">Gerencie seus clientes e produtos de forma simples e eficiente</p>
                        </div>
                    </div>
                </div>
            </section>
  <section className="home__buttons">
                <div className="container">
                    <div className="row">
                        <div className="col-12">
                            <div className="home__buttons__container">
                                <a href="#" className="home__buttons__container__button">
                                    <i className="fas fa-user"></i>
                                </a>                               
                            <a href="#" className="home__buttons__container__button">
                                <i className="fas fa-user-edit"></i>
                            </a>
                            <a href="#" className="home__buttons__container__button">
                                <i className="fas fa-user-minus"></i>
                            </a>
                            <a href="#" className="home__buttons__container__button">
                                <i className="fas fa-box"></i>
                            </a>
                            <a href="#" className="home__buttons__container__button">
                                <i className="fas fa-boxes"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </section >
        <Footer />
        </>

    )
}

export default Home