import { Link } from 'react-router-dom';
import "../../styles/navbarAccueil.css"
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faUser } from '@fortawesome/free-solid-svg-icons';


export const NavbarAccueil = () => {

    return (
        <nav className='navbar'>
            <ul className={`nav-links`}>
                <li><Link to ={"/"} title="Accueil">Accueil</Link></li>
                <li><Link to ={"/messagerie"} title="Messagerie">Messagerie</Link></li>
                <li><Link to ={"/profils"} title="Profils">Découvrir des Profils</Link></li>
                <li><Link to ={"/boites-outils"} title="Boite à Outils">Boîte à Outils</Link></li>
                <li><Link to ={"/contact"} title="Contact">Contact</Link></li>
                <li><Link to ={"/apropos"} title="A propos">A Propos</Link></li>
            </ul>
                <li className='login'>
                    <FontAwesomeIcon className='user' icon={faUser} />
                    <Link to ={"/login"}>Connexion</Link>
                    <FontAwesomeIcon className='user' icon={faUser} />
                    <Link to ={"/register"}>Inscription</Link>
                </li>
        </nav>
    );
};