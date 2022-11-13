import ZdolnoscKredFrom from "./Components/ZdolnoscKredytowa/ZdolnoscKredForm"
import {BrowserRouter as Router, Route, Routes} from "react-router-dom";
import KredytForm from "./Components/Kredyt/KredytForm"
import KontaktForm from "./Components/Kontakt/KontaktForm";
import PomocForm from "./Components/Pomoc/PomocForm";
import RegulaminForm from "./Components/Regulamin/RegulaminForm";
import WarunkiForm from "./Components/Kontakt/Warunki";
import NavBar from "./Components/NavBar/NavBar";
import RejForm from "./Components/Rejestracja/RejForm";
import LogForm from "./Components/Logowanie/LogForm";
function App() {
  return (
      <div className="App">
          <Router>
              <NavBar/>
              <Routes>
                  <Route path="/" exact element/>
                  <Route path={"/formularz-zdolnosci-kredytowej"} element={<ZdolnoscKredFrom/>}/>
                  <Route path={"/strona-wez-kredyt"} element={<KredytForm/>}/>
                  <Route path={"/kontakt"} element={<KontaktForm/>}/>
                  <Route path={"/pomoc"} element={<PomocForm/>}/>
                  <Route path={"/regulamin"} element={<RegulaminForm/>}/>
                  <Route path={"/warunki"} element={<WarunkiForm/>}/>
                  <Route path={"/Register"} element={<RejForm/>}/>
                  <Route path={"/Login"} element={<LogForm/>}/>
              </Routes>
          </Router>
      </div>
  );
}

export default App;