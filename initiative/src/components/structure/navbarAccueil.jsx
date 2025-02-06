import { Link, useNavigate } from 'react-router-dom';
import "../../styles/navbarAccueil.css";


export const NavbarAccueil = () => {

    return (
        <nav className="navbar">
        <div className="navbar-left">
        <Link to="/accueil">Accueil</Link>
        <Link to="/messagerie">Messagerie</Link>
        <Link to="/profils">Profils</Link>
        <Link to="/rendezvous">Rendez-vous</Link>
        </div>
            <div className="navbar-right">
                <Link to="/login">Connexion</Link>
                <Link to="/register">Inscription</Link>
            </div>
        </nav>
    );
};
