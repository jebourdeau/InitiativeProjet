import "../../styles/header.css";
import logo from "../../assets/img/Initiative_newAquitaine.png";
import logo2 from "../../assets/img/ttm_noir.webp";
import { NavbarAccueil } from "./navbarAccueil";



const Header = () => {
    return (
    <header className="App-header">
        <img src={logo} className="initiative" alt="initiative" title="Initiative Nouvelle Aquitaine" />
        <img src={logo2} className="match" alt="TTM" title="Trouve Ton Match"/>
        <>
        <NavbarAccueil/>
        </>
    </header>
    );
};

export default Header;