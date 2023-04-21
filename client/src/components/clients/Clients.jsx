import React from 'react'
import { useState, useEffect } from 'react';
import Navbar from '../navbar/Navbar';
import Footer from '../Footer/Footer';

import './Clients.scss'

const Clients = () => {
    const urlApi = 'http://localhost:8080/client';
    const [clients, setClients] = useState([]);
    const [loading, setLoading] = useState(true);
    useEffect(() => {
        fetch(urlApi)
            .then(response => response.json())
            .then(data => {
                setClients(data);
                setLoading(false);
            })
    }, []);
    if (loading) {
        return <div className="loader">
            <div className="dot"></div>
            <div className="dot"></div>
            <div className="dot"></div>
        </div>
    }
    return (
        <>
            <Navbar />
            <div className="card-group">
                {clients.map(client => (
                    <div className="card">
                        <div className="card-body">
                            <h5 className="card-title">{client.name}</h5>
                            <p className="card-text">{client.marca}</p>
                            <button className="btn btn-danger">Delete</button>
                            <button className="btn btn-warning">Update</button>
                        </div>
                    </div>
                ))}
            </div>
            <Footer />
        </>
    )
}

export default Clients