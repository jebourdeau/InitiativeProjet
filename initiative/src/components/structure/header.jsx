import "../../styles/header.css";
import logo from "../../assets/img/Initiative_newAquitaine.png";
import logo2 from "../../assets/img/ttm_noir.webp";
import { NavbarAccueil } from "./navbarAccueil";
import { useNavigate } from "react-router-dom";


const Header = () => {
    const navigate = useNavigate();
    return (
    <header className="App-header">
        <button className="backhome" type="button" onClick={() => navigate("./")}>Home</button>
        <img src={logo} className="initiative" alt="initiative" title="Initiative Nouvelle Aquitaine" />
        <NavbarAccueil/>
        <img src={logo2} className="match" alt="TTM" title="Trouve Ton Match"/>
    </header>
    );
};

export default Header;