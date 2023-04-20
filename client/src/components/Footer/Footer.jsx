import React from 'react'
import './Footer.scss'


const Footer = () => {
  return (
    <footer className='footer'>
        <div className='footer__container'>
            <p>Desenvolvido por <a href='https://github.com/benetesla' target='_blank' rel='noreferrer'>Benetesla</a></p>
            <p>2023</p>
            <p>Contato: <a href='mailto:benevaniosantos930@gmail.com'>
                <i className='fas fa-envelope'></i>
                </a>
            </p>
        </div>
    </footer>
  )
}

export default Footer