/* eslint-disable jsx-a11y/anchor-is-valid */
import React from 'react'
import './Navbar.scss'
const Navbar = () => {
  return (
    <nav className="navbar navbar-expand-lg navbar-dark">
    <div className="container-fluid">
        <a className="navbar-brand" href="/">
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
                        <li><a className="dropdown-item" href='/clients'>
                            <i className="fas fa-user-circle"></i>
                            <span>Clientes</span>
                            </a></li>
                        <li><a className="dropdown-item" href="#">
                            <i className="fas fa-user-plus"></i>
                            <span>Novo cliente</span>
                            </a></li>
                      </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
  )
}

export default Navbar